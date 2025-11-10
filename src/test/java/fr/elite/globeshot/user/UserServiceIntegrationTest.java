package fr.elite.globeshot.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.datasource.url=jdbc:h2:mem:dcbapzp",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
public class UserServiceIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    private User mockUser;

    @BeforeEach
    public void setup() {
        mockUser = new User(null, "Alice", "profile.jpg", "pwd123", "alice@email.com",
                null, 0, null, LocalDateTime.now(), LocalDateTime.now());
        userRepository.save(mockUser);
    }

    @Test
    public void shouldReturnUserId() {
        Optional<User> user = userService.getUser(mockUser.getId());

        assertTrue(user.isPresent());
        assertThat(user.get().getName()).isEqualTo(mockUser.getName());
    }
}
