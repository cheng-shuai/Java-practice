public class Demo17LoopHourMinute {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) { // 控制小时
            for (int minute = 0; minute < 60; minute++){ // 控制分钟
                for (int second = 0; second < 60; second++) { //控制秒
                    System.out.println(hour + "点" + minute + "分" + second + "秒");
                }
            }
        }
    }
}
