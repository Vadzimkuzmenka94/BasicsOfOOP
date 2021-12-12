package task1_1_1;

public class main {
    public static void main(String[] args) {
        Directory directory = new Directory("С/");
        MyFile myFile = new MyFile("textFileNew", "txt", directory);
        TextFile textFile = new TextFile(text, myFile);
        textFile.createTextFile();
        textFile.renameFile("Добрейший вечерочек");
        textFile.printTextFile();
        textFile.addText(textAdd);
        textFile.deleteText();
        textFile.deleteFile();
    }

    static String text = "Добрейший вечерочек, добрый вечер, здравствуйте, приветствую";
    static String textAdd = "как дела? как вы себя чувстсвуете ?";
}


