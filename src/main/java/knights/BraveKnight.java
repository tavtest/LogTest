package knights;

import loggers.Minstrel;
import quests.Quest;

public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel mistrel;

    public BraveKnight(Quest quest, Minstrel mistrel) {
        this.quest = quest; // Внедрение сценария подвига
        this.mistrel = mistrel;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
