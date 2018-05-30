package de.dynamight.akka.junit;

import akka.actor.ActorSystem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(AkkaJunitExtension.class)
@AkkaJunitExtensionConfig(name = "test")
class AkkaJunitExtensionTest {

  @Test
  void actorsystem_is_present(ActorSystem system) {
    assertThat(system).isNotNull();
  }

  @Test
  void actorsystem_has_started(ActorSystem system) {
    assertThat(system.startTime()).isGreaterThan(0);
  }

  @Test
  void actorsystem_has_name_test(ActorSystem system) {
    assertThat(system.name()).isEqualTo("test");
  }
}
