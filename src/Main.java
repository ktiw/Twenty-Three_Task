public class Main {
    public static void main(String[] args)  {
       FileHandler fileHandler = new FileHandler();
       fileHandler.writeActionLog("actions.log", "Игрок Alex зашел на сервер.");
       fileHandler.writeActionLog("actions.log", "Игрок Max_Pvp убил зомби.");
       fileHandler.writeActionLog("actions.log", "Игрок Newbie нашел алмазы!.");
    }
}

