package hu.bme.aut.threads.threads

import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository

@Entity
@Table(name = "threads")
data class Thread(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String
)

interface ThreadRepository: CrudRepository<Thread, Int>


