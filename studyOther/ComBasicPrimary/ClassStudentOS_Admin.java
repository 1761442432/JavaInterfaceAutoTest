package main.java.ComBasicPrimary;

public class ClassStudentOS_Admin { // 管理学生的类
    // 创建学生的方法
    public void createStu(String name, String sex, ClassStudentOS_Score[] arr){
        ClassStudentOS_Score stu = new ClassStudentOS_Score();
        int i = createIndex(arr);
        if (i != 9999){ // i !=9999 说明 stu数组 还有空间继续添加
            stu.setOn(i+1);  // 将 i（无值）的位置设置 on
            stu.setName(name);
            stu.setSex(sex);
            arr[i] = stu;   // 将stu返回的结果插入到arr[索引]的位置
        }
    }
    // 查找学生
    public int findStu(int on, ClassStudentOS_Score[] arr){
        // 查找编号，如果存在就返回该编号，不存在则返回 9999
        for(int i=0; i<arr.length; i++){
            if (arr[i].getOn()==on){
                return on;
            }
        }
        return 9999;
    }
    public void updateStu(int on, String name, String sex, ClassStudentOS_Score[] arr){
        // 更新学生信息
        ClassStudentOS_Score stu = new ClassStudentOS_Score();
        stu.setOn(on);
        stu.setName(name);
        stu.setSex(sex);
        arr[on-1] = stu;
    }
    public void delete(int on, ClassStudentOS_Score[] arr){
        // 删除学生信息
        arr[on-1] = null;
    }
    public void inputScore(int on, int java, int c, int sql, ClassStudentOS_Score[] arr){
        // 输入学生成绩
        arr[on-1].setJava(java);
        arr[on-1].setC(c);
        arr[on-1].setSql(sql);
        arr[on-1].setTotal();
        arr[on-1].setAverage();
    }

    // 学生编号Index
    public int createIndex(ClassStudentOS_Score[] arr){
        // 判断 arr[i] 是否有值，作用：无值则添加学生信息
        for (int i=0; i<arr.length; i++){
            if (arr[i] == null){
                return i;
            }

        }
        return 9999;  // 说明到达最大人数限制
    }
    // 打印数组
    public void print(ClassStudentOS_Score[] arr){
        // 数组有值，则打印
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
    public void print(ClassStudentOS_Score[] arr, int on){
        // 根据索引，打印对应数组
        System.out.println(arr[on-1]);
    }
    public void sortScore(String type, ClassStudentOS_Score[] arr){
        if (type == "java"){
            for (int i=0; i<arr.length-1; i++){
                for (int j=1; j<arr.length; j++){
                    if (arr[i].getJava() < arr[j].getJava()){
                        ClassStudentOS_Score arr2 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr2;
                    }
                }
            }
        } else if(type == "c"){
            for (int i=0; i<arr.length-1; i++){
                for (int j=1; j<arr.length; j++){
                    if (arr[i].getC() < arr[j].getC()){
                        ClassStudentOS_Score arr2 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr2;
                    }
                }
            }
        }else if(type == "sql"){
            for (int i=0; i<arr.length-1; i++){
                for (int j=1; j<arr.length; j++){
                    if (arr[i].getSql() < arr[j].getSql()){
                        ClassStudentOS_Score arr2 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr2;
                    }
                }
            }
        }else if(type == "total"){
            for (int i=0; i<arr.length-1; i++){
                for (int j=1; j<arr.length; j++){
                    if (arr[i].getTotal() < arr[j].getTotal()){
                        ClassStudentOS_Score arr2 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr2;
                    }
                }
            }
        }

    }

}
