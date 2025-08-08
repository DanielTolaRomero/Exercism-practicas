class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");
        identifier = identifier.replace("0", "o");
        identifier = identifier.replace("1", "l");
        identifier = identifier.replace("3", "e");
        identifier = identifier.replace("4", "a");
        identifier = identifier.replace("7", "t");
        identifier = identifier.replaceAll("[^a-zA-Z_-]", "");

        StringBuilder sb = new StringBuilder(identifier);
        int index = sb.indexOf("-");

        while ((index = sb.indexOf("-")) != -1) {
                char c = sb.charAt(index + 1);
                sb.replace(index, index + 2, String.valueOf(Character.toUpperCase(c)));
        }

        return sb.toString();
        
    }
}
