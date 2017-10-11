import org.junit.Test;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.Manager;
import dev.tilegame.Game;

public class UnitTest {
    private Game game = new Game("test game", 360, 640);
    private Manager manager = new Manager(game);
    private Pet pet = new Pet(manager, 32*20,32*20);
    @Test
    public void testSomething() {

    }
}
