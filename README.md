# Java-lab2
lab2-学生选课系统

## 一、实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法。
2. 掌握面对对象的类设计方法（属性、方法）。
3. 掌握通过构造方法实例化对象。
4. 学会使用数组。

## 二、业务要求
1. 学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。每名教师可讲授多门课程，每名学生可选修多门课程。
2. 多门课程，可用课程数组形式表达。
3. 对象示例：教师（编号、姓名、性别、所授课程)
<br>&emsp;&emsp;&emsp;&emsp;&emsp;学生(编号、姓名、性别、所选课程)
<br>&emsp;&emsp;&emsp;&emsp;&emsp;课程(编号、课程名称、上课地点、时间)

## 三、实验要求
1. 编写上述实体类以及测试主类
2. 在测试主类中，实例化多个类实体，模拟
   <br>1)教师开设某课操作；
   <br>2)学生选课操作、退课操作
   <br>3)打印学生课表信息(包括：编号、课程名称、上课地点、时间、授课教师等
3. 编写实验报告。

## 四、实验过程
1. 编写上述三个实体类Teacher、Student、Course以及测试类Simulate，把这些类放在xuankeSystem包里。 
<br>在Teacher类里设置了老师的工号id，姓名name，性别sex，Course类用来将课程加到老师的课表里，cour[]用来储存老师的课程。 
<br>在Student类里设置了学生学号id，姓名name，性别sex，专业major。 
<br>在Course类里设置了课程号id，课程名name，上课地点place，上课时间week和time，授课教师teacher，上课学生数量stu_num。并设置构造函数初始化对象参数。<br>在Simulate类里设置主函数，创建一个课程数组并实例化存入数组中。
2. 在界面有老师身份和学生身份可以选择。如果是教师登录，通过输入的老师的信息，初始化一个Teacher对象，对比课程数组中每一个课程的老师的姓名，相同则写入到该老师的课程数组里。
<br>输出该老师的课程表的话则是在Teacher类中里设置了show函数，在主函数中调用，输出储存在教师数组中的课程信息。
3. 如果是学生登录，同样通过输入的学生的信息，初始化一个Student对象，然后输出所有的课程信息让学生来选课。
在选课时通过获取学生输入的课程号，找到课程数组对应的课程号，则将该课程加入到学生个人的课程数组中。
<br>选课成功后可以有后续操作，是否进行继续选课，退课，显示课表或退出等操作。 
在选课期间若有重复选课或者课程号输入错误，同样也会提示重新操作
4. 在进行退课操作时，则是调用Student类中的tuike函数。 采用的是用一个新的数组来存放不需要退掉的课程，需要退的课程仍放在原数组中，然后用新数组代替原数组来实现退课功能。
<br>显示课表功能通过调用Student类中的show()函数来实现。
<br>不需要继续操作时选择退出，结束程序。

## 五、主要代码
1.类名[] 数组名 = new 类名 的格式，创建课程数组，并初始化课程变量存入数组。
```java
        Course[] cour = new Course[5];
        //实例化多个课程对象
        Course c1 = new Course(202101,"C语言","董轶群","教103",1,"8:00-9:40",120);
        //课程对象添加到课程数组
        cour[0] = c1;
        Course c2 = new Course(202102,"线代","董轶群","教202",3,"15:30-17:10",90);
        cour[1] = c2;
        Course c3 = new Course(202103,"Web","赵益军","综0618",5,"13:30-17:10",68);
        cour[2] = c3;
        Course c4 = new Course(202104,"Java","张世博","1710",2,"8:00-9:40",60);
        cour[3] = c4;
        Course c5 = new Course(202105,"Python","张世博","综0606",4,"10:00-11:40",44);
        cour[4] = c5;
```
2. 通过Scanner in获取输入。
```java
        //获取控制台的输入
        Scanner in = new Scanner(System.in);
        //界面
        System.out.println("\n********************北京石油化工学院教务处********************\n"+
                "                      请选择您的身份:\n"+
                "                教师系统请按1  学生系统请按2");

                int a = in.nextInt();
```
3.通过遍历循环，对比课程数组中每一个课程的授课老师和教师的姓名，将两个变量的值相同的项，写入该教师的课程数组里。
```java
        //循环课程数组，将某教师的课程添加到教师个人课表数组里
        for (int i = 0; i < cour.length; i++) {
            if
        } (cour[i] == null) {
            break;
        }
        else {
              //字符串比较用Objects.equals()，如果老师的名字和课程里老师的名字对应，就导入到这个老师的课表里
              if (Objects.equals(tea.name, cour[i].teacher)) {
                  tea.daoru(cour[i]);
              }
              else {
                  continue;
              }
        }
        //输出老师课表
        tea.tea_show();
```
4.Teacher类中show函数，显示程数组项的课程信息。
```java
    //老师课表
    void tea_show(){
        System.out.println(this.name+"的课表");
        for(int i=0;i<tea_cour.length;i++){
            if(tea_cour[i]==null){
                continue;
            }
            else{
                System.out.print("课程号："+tea_cour[i].id);
                System.out.print(" 课程名："+tea_cour[i].name);
                System.out.print(" 授课老师："+tea_cour[i].teacher);
                System.out.print(" 上课地点："+tea_cour[i].place);
                System.out.print(" 上课时间：周"+tea_cour[i].week+" "+tea_cour[i].time);
                System.out.println(" 课程人数："+tea_cour[i].stu_num);
            }
        }
    }
```
5. Student类中选课函数，将已选课程加入学生的个人课程数组。
```java
    //学生选课函数
    void xuanke(int course_id, Course[] stu_c) {
        //输入的课程号与课组里某门课的课号相等，则将该门课添加到学生的个人课程数组里
        for (int a = 0; a < stu_c.length; a++) {
            if (course_id == stu_c[a].id) {
                for (int b=0; b<stu_cour.length; b++){
                    if(stu_cour[0] == null) {
                        stu_cour[i] = stu_c[a];
                        i++;
                        System.out.println("您已成功选上该课程！");
                        break;
                    }
                    if(stu_cour[0] != null){
                        if (stu_cour[b] == null){
                            continue;
                        }
                        if(course_id == stu_cour[b].id){
                            System.out.println("重复选择，请重新操作！");
                            break;
                        }
                        else{
                            stu_cour[i] = stu_c[a];
                            i++;
                            System.out.println("您已成功选上该课程！");
                            break;
                        }
                    }
                }
                break;
            }
            else {
                System.out.println("课程号输入错误，请重新操作！");
                break;
            }
        }
    }
```
6. 退课操作，Student类中的tuike函数。用一个新的数组来存放不需要退掉的课程，需要退的课程仍放在原数组中，然后用新数组代替原数组来实现退课功能。
```java
    //退课函数
    void tuike(int id){
        //数组a用来储存学生退课后的课程
        Course[] a = new Course[5];
        //输入的课号与学生个人课组里某门课的课号相等，则将除该门课以外的其他课添加到数组a里，再把数组a又给stu_cour
        for(int i=0, j=0; i<stu_cour.length; i++) {
            //如果学生选的课不足5门，则跳过数组中的空值
            if (stu_cour[i] == null) {
                continue;
            }
            else {
                if (id == stu_cour[i].id) {
                    continue;
                }
                else {
                    a[j] = stu_cour[i];
                    j++;
                }
            }
        }
        stu_cour = a;
        System.out.println("您已成功退出该课程!");
    }
```

## 六、流程图
![](https://github.com/haaix/Java-lab2/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

## 七、运行截图
 **教师界面**
![](https://github.com/haaix/Java-lab2/blob/main/%E8%80%81%E5%B8%88%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
<br> **学生界面**
![](https://github.com/haaix/Java-lab2/blob/main/%E5%AD%A6%E7%94%9F%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)

## 八、实验感想
&emsp;&emsp;做完这次实验我发现其实不管java东西有多少，总有规律可循。 对于学习java基础的经验就是多做、多思考，
基础知识的学习不能不求甚解，要追本溯源，弄清问题的本质。这样才能举一反三，由点及面。
java的所有编程思路都是“面向对象”的编程。所以大家在往更高境界发展以前一定要打好基础，基础是王道。
我们的基础要扎实。所谓打好基础并不是说要熟悉所有的java代码。要了解java的结构，让自己在结构上对java有个立体而且整体的了解。
