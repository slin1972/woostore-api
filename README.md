
* 分类详情模块 

1.1 全部分类 
/category

1.2 分类内资源
/category/cid

1.3 资源详情
/item/info/id

1.4 资源下载
/item/down/id

1.5 评论资源
/item/comment

1.6 评分资源 
/item/score


* 榜单列表模块

2.1 资源排行榜
/top  （下载排行，上升排行，最新上架排行）

2.2 专题列表 
/feature

2.3 专题内资源 
/feature/fid


* 搜索推荐模块

3.1 搜索资源
/search

3.2 热门搜索
/search/hot

3.2 详情页-相关推荐
/rec/info/id

3.3 首页 - 推荐
/rec/index

* 通用功能

4.1 版本检测 自动更新（强制升级）
4.2 用户反馈 
4.3 数据上报 


* 附录：

Item 数据模型
<pre>
    {
    id:112,
    softname:'业务名称 如app的包名等',
    itemname:'资源名称', 
    displayName:'显示名称',
    intro:'一句话介绍',
    detail:'详细介绍',
    iconUrl:''
    remark:'编辑推荐语',
    screenshot:'截图',
    author:'qq',
    keyword:'hello',
    tags:'new,offcial,update,editrec',
    categoryId:1,
    
    versionName:'1.0',
    versionCode:'120',
    size:'12M',
    fileMd5:'md5(downUrl file)',
    downUrl:'',
    downCount:222,
    commentCount:20,
    score:4.9,
    
    itemType:'下载类|购物类|服务类',
    saleType:'free',
    saleStatus:'new|onsale|offsale|delete',
    channel:1,
    price: 1800.00,
    specification:'红色|M码|男款',

    createTime:'',
    lastActionName:'',
    lastActionBy:'',
    lastActionTime:'',
    }
</pre>
Category分类数据模型
<pre>
 {
    id:1,
    name:,
    parentCatId:,
    orderIndex:
 }
</pre>
Comment 评论数据模型
<pre>
{
    id:,
    itemId:,
    status:,
    message:,
    device:,
    createTime:,
}
</pre>
Feature 专题数据模型
<pre>
{
    id,
    name:'内部命名，如 植树节专题',
    intro:'编辑推荐语  一句话',
    detail:'详细介绍，如活动参与方式等',
    itemListId,
    featureType:'专题类型',
    showType:'前端展示类型，如网格，列表,banner 等',
    fromTime:'生效时间',
    toTime:'结束时间',
    creator,
    createTime,
    modifyTime,
}
</pre>
Author 数据模型
<pre>
{
    id,
    name,
    companyName,
    code,
    contact,
    createTime,
}
</pre>
