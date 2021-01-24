import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 修改端口号的方式
 *    1，在资源（resource）文件夹 创建文件：application.properties
 *    2，在文件内写着这句话（将端口好改为8888）：server.port=${port:8888}
 * 备注：
 *    application.properties  文件名为固定写法，只有这个文件名才能被创建的application类识别
 *    server.port=${port:端口号}  // 固定设置端口号的方式
 */

//在SpringBoot中，一般已该类作为入口
// 设置完成后，可以直接运行该类，就会加载需要扫描包内的所有文件
// 备注：也可以不设置，直接在写的接口类里运行
@SpringBootApplication                       // 固定写法
@ComponentScan("com.springBoot.demo")        // 需要扫描的包（括号内为包名）
public class Application {

    public static void main(String[] args) {
        //  SpringApplication.run() ：固定写法，表示需要运行的类
        //  Application ：与当前类文件名一致，args：无意义参数，可以使用其他代替
        SpringApplication.run(Application.class, args);
    }
}

