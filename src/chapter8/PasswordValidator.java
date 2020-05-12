package chapter8;

/**
 * Validate the complexity of a proposed password by assuring that it meets these rules:
 * at least 8 characters long
 * contain an uppercase letter
 * contain a special character
 * not contain username
 * not the same as the old password
 */
public class PasswordValidator {
    public static void main(String[] args) {
        String oldPassword = "Mantapjiwa!";
        String userName = "aga";
        String newPassword = "Mantap!ag2jiwa";
        boolean isValid = true;

        if(!isSameOldPassword(newPassword,oldPassword)){
            isValid = false;
        }
        if(!isEightCharacters(newPassword)){
            isValid = false;
        }
        if(!isContainUppercaseLetter(newPassword)){
            isValid = false;
        }
        if(!isContainSpecialCharacter(newPassword)){
            isValid = false;
        }
        if(!isContainUserName(newPassword, userName)){
            isValid = false;
        }

        if(isValid){
            System.out.println("Successfully updated password!");
        }


    }

    /**
     * Check that new password is not equal to old password
     * @param newPassword string of new password
     * @param oldPassword string of old password
     * @return false if new password is the same as old password, true if new password is different from old password
     */
    public static boolean isSameOldPassword(String newPassword, String oldPassword){
        if(newPassword.equals(oldPassword)){
            System.out.println("Failed to update password! New password CANNOT be the same as old password!");
            return false;
        }
        else return true;
    }

    /**
     * Check that new password is at least 8 characters in length
     * @param newPassword string of new password to be checked
     * @return false if new password is fewer than 8 characters, true if new password is more than 8 characters
     */
    public static boolean isEightCharacters(String newPassword){
        int requiredPasswordLength = 8;
        if(newPassword.length()<requiredPasswordLength){
            System.out.println("Failed to update password! New password should be at least 8 characters long");
            return false;
        }
        else return true;
    }

    /**
     * Check that new password has at least 1 uppercase letter
     * @param newPassword new password string to be checked
     * @return false if it has no uppercase letter, true if it has uppercase letter
     */
    public static boolean isContainUppercaseLetter(String newPassword){
        boolean hasUppercase = !newPassword.equals(newPassword.toLowerCase());

        if(hasUppercase){
            return true;
        }
        else{
            System.out.println("Failed to update password! New password should contain at least 1 uppercase letter!");
            return false;
        }
    }

    /**
     * Check that the new password has at least 1 special character
     * @param newPassword new password string to be checked
     * @return false if it has no special character, true if it has special character
     */
    public static boolean isContainSpecialCharacter(String newPassword){
        boolean hasSpecialCharacter = !newPassword.matches("[A-Za-z0-9 ]*");

        if(hasSpecialCharacter){
            return true;
        }
        else {
            System.out.println("Failed to update password! New password should contain at least 1 special character!");
            return false;
        }
    }

    /**
     * Check that th new password does not contain username
     * @param newPassword string of new password to be checked
     * @param userName string of username
     * @return false if new password contains username, true if new password does not contain username
     */
    public static boolean isContainUserName(String newPassword, String userName){
        boolean hasUserName = !newPassword.contains(userName);

        if(hasUserName){
            return true;
        }
        else {
            System.out.println("Failed to update password! New password should not contain username!");
            return false;
        }
    }

}
