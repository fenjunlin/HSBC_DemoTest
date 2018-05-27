/**
 * Created by wuxiaowen on 2018/5/27.
 */
public class DemoMainCtrl {

    /**
     * 问题一
     * 筛选3（Fizz），5（Buzz），3*5（FizzBuzz）的倍数输出列表
     * @param num
     */
    public static void pritnList35(int num){
        if(num>0){
            for(int i=1;i<=num;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("输入参数为负数，请输入正整数参数！！");
        }
    }

    /**
     * 问题二.1
     * 筛选包含3和3的倍数输出集
     * @param num
     */
    public static void pritnList3(int num){
        if(num>0) {
            for (int i = 1; i <= num; i++) {
                if ((i % 3 == 0) || (i + "").contains("3")) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("输入参数为负数，请输入正整数参数！！");
        }
    }

    /**
     * 问题二.2
     * 筛选包含5和5的倍数输出集
     * @param num
     */
    public static void pritnList5(int num){
        if(num>0) {
            for (int i = 1; i <= num; i++) {
                if ((i % 5 == 0) || (i + "").contains("5")) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("输入参数为负数，请输入正整数参数！！");
        }
    }

    public static void main(String[] args) {
        pritnList35(100);
    }
}
