package hu.bme.aut.threads.threads

import org.springframework.web.bind.annotation.*

data class ThreadDto(val id: Int, val name: String)

data class MessageDto(val id: Int, val text: String)

@RestController
@RequestMapping("/threads")
class ThreadsController(
    val threadRepository: ThreadRepository,
    val messageRepository: MessageRepository,
) {


    @GetMapping
    fun getThreads() = threadRepository.findAll().map {
        ThreadDto(it.id, it.name)
    }

    @PostMapping
    fun postThread(@RequestBody threadName: String){
        threadRepository.save(Thread(name = threadName))
    }

    @GetMapping("/{id}")
    fun getMessages(@PathVariable id: Int) = messageRepository.findAllByThreadId(id).map {
        MessageDto(it.id, it.text)
    }

    @PostMapping("/{id}")
    fun postMessage(@PathVariable id: Int, @RequestBody message: String){
        messageRepository.save(Message(id = 0, text = message, threadId = id))
    }
}