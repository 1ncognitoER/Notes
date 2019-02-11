package permanentCalendar;

/**
 * 万年历
 * @author Blood Moon
 *
 */
public class TCalculateTest {
	public static void main(String[] args) {
		//创建一个计算类的对象tc
		TCalculate tc = new TCalculate();
		//输入日期
		tc.input();
		//计算年经过的天数
		tc.CalculYearDay();
		//计算月经历的天数，与年经过的天数合成总天数
		tc.CalculMonthDay();
		//通过总天数计算该月一号的星期
		tc.CalculWeek();
		//打印日历
		tc.show();
	}
}
