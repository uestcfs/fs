
Controller 相关注解
@Api: 可设置对控制器的描述。
@Api 主要属性
注解属性	类型	描述
tags	String[]	控制器标签。
description	String	控制器描述（该字段被申明为过期）。

接口相关注解
@ApiOperation: 可设置对接口的描述。
@ApiOperation 主要属性
注解属性	类型	描述
value	String	接口说明。
notes	String	接口发布说明。
tags	Stirng[]	标签。
response	Class<?>	接口返回类型。
httpMethod	String	接口请求方式。
@ApiIgnore: Swagger 文档不会显示拥有该注解的接口。

@ApiImplicitParams: 用于描述接口的非对象参数集。
@ApiImplicitParam: 用于描述接口的非对象参数，一般与 @ApiImplicitParams 组合使用。
@ApiImplicitParam 主要属性
注解属性	描述
paramType	查询参数类型，实际上就是参数放在那里。取值：
path：以地址的形式提交数据，根据 id 查询用户的接口就是这种形式传参。
query：Query string 的方式传参。
header：以流的形式提交。
form：以 Form 表单的形式提交。
dataType	参数的数据类型。取值：
Long
String
name	参数名字。
value	参数意义的描述。
required	是否必填。取值：
true：必填参数。
false：非必填参数。

Model 相关注解
@ApiModel: 可设置接口相关实体的描述。
@ApiModelProperty: 可设置实体属性的相关描述。
@ApiModelProperty 主要属性
注解属性	类型	描述
value	String	字段说明。
name	String	重写字段名称。
dataType	Stirng	重写字段类型。
required	boolean	是否必填。
example	Stirng	举例说明。
hidden	boolean	是否在文档中隐藏该字段。
allowEmptyValue	boolean	是否允许为空。
allowableValues	String	该字段允许的值，当我们 API 的某个参数为枚举类型时，使用这个属性就可以清楚地告诉 API 使用者该参数所能允许传入的值。
