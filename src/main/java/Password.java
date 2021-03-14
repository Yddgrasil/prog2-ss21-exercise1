

    public class Password {

        public static boolean checkPassword(String password) {

            if (password.length() < 8 || password.length() > 25) {
                return false;
            }

            if (password.equals(password.toLowerCase())) {  //converts all letters to lower case and compares them
                return false;  //if false they are different, therefore not all lowercase

            }

            if (password.equals(password.toUpperCase())) {  //converts all letters to upper case and compares them
                return false;
            }
            if (!password.matches(".*\\d.*")) {
                return false;
            }

            boolean containsSpecialCharacter = false;
            for (char c : password.toCharArray()) {  //splits into Array to be able to look at each char
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    continue;
                }
                if (")#$?!%/@".indexOf(c) >= 0) { //checks if one of those are included, using Rgeex

                    containsSpecialCharacter = true;
                } else return false;


            }
            return containsSpecialCharacter;


        }

        public static boolean hasConsecutiveCharacters(String password) {
            String[] letter = password.split(""); //split the string

            for (int i = 0; i < letter.length - 2; i++) {
                if (letter[i].equals(letter[i + 1]) && letter[i + 1].equals(letter[i + 2])&& letter[i + 1].equals(letter[i + 3])) { //check if letters are identical more than 3 time sin a row
                    return true;
                }
            }
            return false;
        }



        }




