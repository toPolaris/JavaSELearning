package Threads;

/**
 * learning.Threads
 * Created by Protein on 2020/7/29 14:41
 * Description: 假定生产一种一次性工具Tool需要材料outer和inner，用布尔类型state描述Tool是否加工完成，index表示工具出场编号
 */
public class Tool {
    String inner;
    String outer;
    int index;
    boolean state = false;//默认为false状态
}
