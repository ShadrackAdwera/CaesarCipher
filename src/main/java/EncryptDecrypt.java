public class EncryptDecrypt {
private String textMessage;
private int shiftBy;

public EncryptDecrypt(String textMessage, int shiftBy){
this.textMessage = textMessage;
this.shiftBy = shiftBy;
}
public String getTextMessage(){
    return this.textMessage;
}
public int getShiftBy(){
    return this.shiftBy;
}
public String encryption(){
    StringBuilder result = new StringBuilder();
    for (char character : textMessage.toCharArray()) {
        if (character != ' ') {
            int asciiPosition = character - 'a';
            int newPosition = (asciiPosition + shiftBy) % 26;
            char newCharacter = (char) ('a' + newPosition);
            result.append(newCharacter);
        } else {
            result.append(character);
        }
    }
    return result.toString();
}
}
