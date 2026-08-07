package week02.day12;

public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "Java is awesome";
        String noSpacesText = "";
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ')
                continue;
            else noSpacesText=noSpacesText+text.charAt(i);
        }

        System.out.println(noSpacesText);
    }
}
