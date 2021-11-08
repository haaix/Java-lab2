package xuankeSystem;
import java.util.Arrays;

//定义老师类
public class Teacher {
    //老师属性
    int id;
    String name;
    String sex;
//    Course course;
    Course[] tea_cour = new Course[5];
    int i;

//    Teacher(){};
    //构造函数
    Teacher(int id,String name,String sex){
        this.id = id;
        this.name = name;
        this.sex = sex;

    }

    //导入老师各自的课程
    void daoru(Course tea_c){
        tea_cour[i] = tea_c;
        i++;
    }

    //老师课表
    void tea_show(){
        System.out.println(this.name+"的课表");
        for(int i=0;i<tea_cour.length;i++) {
            if (tea_cour[i] == null) {
                continue;
            }
            else {
                System.out.print("课程号："+tea_cour[i].id);
                System.out.print(" 课程名："+ tea_cour[i].name);
                System.out.print(" 授课老师："+tea_cour[i].teacher);
                System.out.print(" 上课地点："+tea_cour[i].place);
                System.out.print(" 上课时间：周"+tea_cour[i].week +" "+ tea_cour[i].time);
                System.out.println(" 课程人数："+tea_cour[i].stu_num);
            }
        }
    }
}
