import static org.mockito.Mockito.*;
import knights.BraveKnight;
import loggers.Minstrel;
import org.junit.Test;
import quests.Quest;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class); // Создание фиктивного
        Minstrel mockMinstrel = mock(Minstrel.class);
// объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest, mockMinstrel); // Внедрение
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
