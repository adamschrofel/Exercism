class ReverseString {

    String reverse(String inputString) {
        char[] chars = inputString.toCharArray();
        String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

}
