# Demo-Lombok

尝试使用Lombok减少代码

一个意外

在创建第二个order的api时，无法初始化，原因是H2数据库貌似无法新建表，只能将两个实体类混合，除非在实体类前加上@Table

类似

```java
package com.example.demolombok.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_ORDER")
class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String status;

    Order(String description,String status){
        this.description = description;
        this.status = status;
    }
}
```
最佳的办法应该是消除异议，主动分辨，在每一个需要单独处理的实体类增加一个@Table