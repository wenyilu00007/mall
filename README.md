## 信息控制管理系统

## 项目结构说明
    
    |-- mall-proxy                              // 各种方式调用其他系统
    |-- mall-common                             // 系统内部需要使用的通用功能，系统内部使用依赖，不适用服务调用
    |-- mall-shared                             // 与外部系统进行交互的实体、接口定义等，方便交互
    |-- mall-util                               // 工具类
    |-- mall-base                               // 基础信息维护
    |-- mall-order                              // 接收各个渠道下的订单
    |-- mall-trace                              // 接收物流轨迹回传及后续流程触发
    |-- mall-product                            // 产品管理
    |-- mall-process                            // 流程管理
    |-- mall-vendor                             // 供应商管理
    |-- mall-route                              // 路由管理
    |-- mall-cost                               // 成本定义
    |-- mall-times                              // 时效管理





| 对应系统      |服务名  | 日志路径           |   覆盖的菜单    |
|:-------------:| --- |:-------------|:-----|
| aquarius      |  mall-base              |/opt/app/logs/mall-base.log      | 行政区域、偏远地区|
|               |  mall-vendor            |/opt/app/logs/mall-vendor.log    | 供应商基础信息、分拣中心、站点、揽收范围、口岸|
|               |  mall-product           |/opt/app/logs/mall-product.log   | 产品信息|
|               |  mall-order             |/opt/app/logs/mall-order.log     | 交接单、客户清单 |
| leo           |  leo-business               |/opt/app/logs/leo.log                | 权限管理系统|
| cancer        |  cancer-customer            |/opt/app/logs/cancer-customer.log    | 客户管理系统|
| taurus        |  taurus-recharge            |/opt/app/logs/taurus-recharge.log    | 财务系统|