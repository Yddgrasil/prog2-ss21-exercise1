

    public class Password {

        public static boolean checkPassword(String password) {

            if (password.length() <8 || password.length() >25){
                return false;
            }

            if( password.equals(password.toLowerCase()) ){
                return false;

            }

            if( password.equals(password.toUpperCase()) ){
                return false;
            }
            if (!password.matches(".*\\d.*")){
                return false;
            }

            boolean containsSpecialCharacter = false;
            for (char c : password.toCharArray()) {
                if(Character.isLetter(c) || Character.isDigit(c)) {
                    continue;
                }
                    if (")#$?!%/@".indexOf(c) >= 0) {
                        containsSpecialCharacter = true;
                    }
                    else
                        return false;


            }
            return containsSpecialCharacter;


     /*       boolean isConsecutiveNumber = false; {
                char[] ch = new char[password.length()];
                String[];
                for(int i = 0; i < password.length() - 2; i++) {
                    if (password[i + 1] == password[i] + 1 && password[i + 2] == password[i] + 2) return true;
                    isConsecutiveNumber = true;
                }


                return false;
            }

      */



        }




    }


