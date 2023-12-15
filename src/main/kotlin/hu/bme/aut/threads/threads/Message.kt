package hu.bme.aut.threads.threads

import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository

@Entity
@Table(name = "messages")
data class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val text: String,
    val threadId: Int
)

interface MessageRepository: CrudRepository<Message, Int> {
    fun findAllByThreadId(threadId: Int): Iterable<Message>
}