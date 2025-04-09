@NotNull	验证字段值不为 null 任意类型	
@NotNull(message = "ID不能为空") private Long id;

@Null	验证字段值必须为 null	任意类型
@Null(message = "预留字段必须为空") private String reserved;

@NotEmpty	验证字符串、集合或数组非空	String, Collection	
@NotEmpty(message = "名称不能为空") private String name;

@NotBlank	验证字符串非空且至少包含一个非空格字符	String	
@NotBlank(message = "密码不能为空") private String password;

@Size	验证字符串、集合或数组的长度/大小	String, Collection	
@Size(min=2, max=10, message="长度需在2-10之间") private String code;

@Min	验证数值最小值	数值类型（int, long等）	
@Min(value=18, message="年龄需≥18") private int age;

@Max	验证数值最大值	数值类型	
@Max(value=100, message="年龄需≤100") private int age;

@DecimalMin	验证数值最小值（支持字符串形式）	数值类型, String	
@DecimalMin(value="0.5", inclusive=false) private BigDecimal price;

@DecimalMax	验证数值最大值（支持字符串形式）	数值类型, String	
@DecimalMax(value="100.0") private Double score;

@Digits	验证数值的整数和小数位数	数值类型	
@Digits(integer=3, fraction=2) // 最大999.99

@Email	验证字符串为合法邮箱格式	String	
@Email(message="邮箱格式错误") private String email;

@Pattern	验证字符串匹配正则表达式	String	
@Pattern(regexp="^[A-Za-z0-9]+$", message="只能包含字母和数字")

@Positive	验证数值必须为正数	数值类型	
@Positive(message="金额必须为正数") private BigDecimal amount;

@PositiveOrZero	验证数值必须为正数或零	数值类型	
@PositiveOrZero private Integer stock;

@Negative	验证数值必须为负数	数值类型	
@Negative(message="温度需低于0℃") private Double temperature;

@NegativeOrZero	验证数值必须为负数或零	数值类型	
@NegativeOrZero private Integer offset;

@Future	验证日期/时间在将来	Date, LocalDate 等	
@Future(message="截止时间需晚于当前") private LocalDateTime endTime;

@FutureOrPresent	验证日期/时间在将来或当前	Date, LocalDate 等	
@FutureOrPresent private Date startDate;

@Past	验证日期/时间在过去	Date, LocalDate 等	
@Past(message="出生日期需为过去") private LocalDate birthday;

@PastOrPresent	验证日期/时间在过去或当前	Date, LocalDate 等	
@PastOrPresent private Instant timestamp;