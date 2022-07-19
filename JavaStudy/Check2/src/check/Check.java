package check;

import constants.Constants;

public class Check {

    private static String firstName = "朋哉";
    private static String lastName = "大山";

    public static void main(String[] args) {
        // printNameメソッドの実行
        printName(firstName, lastName);

        // Petクラスをインスタンス化し、指定メッセージ出力
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        pet.introduce();

        // RobotPetクラスをインスタンス化し、指定メッセージ出力
        Pet rPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        rPet.introduce();
    }

    /**
     * printNameメソッド 第1引数に名前、第2引数に苗字を受け取り結合して表示
     * @param String firstName 名前
     * @param String firstName 苗字
     */
    private static void printName(String firstName, String lastName) {
        // firstNameとlastNameを結合して表示
        System.out.println("printNameメソッド　→　" + lastName + firstName);

    }

}
