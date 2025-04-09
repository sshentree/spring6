1. exists() 方法的含义

Resource 接口的 exists() 方法用于判断资源是否物理存在或可访问。对于大多数实现类：

    ClassPathResource：检查类路径下文件是否存在。

    FileSystemResource：检查文件系统中路径是否存在。

    ByteArrayResource：基于内存中的字节数组，无需物理存储，因此总是存在。
4. 注意事项
   ① exists() 不代表数据有效

exists() 返回 true 仅表示资源可访问，但不保证数据有意义。例如：

    字节数组可能为空（byte[0]）。

    字节数组内容可能是损坏的二进制数据。

② 判断数据是否为空

如果需要检查字节数组是否非空，应直接判断其长度     
5. 对比其他 Resource 的 exists()
   Resource 类型	exists() 逻辑
   ByteArrayResource	始终返回 true（数据在内存中，资源已存在）
   ClassPathResource	检查类路径下文件是否存在
   FileSystemResource	检查文件系统中路径是否存在
   UrlResource	检查 URL 指向的资源是否可访问（如 HTTP 200 响应）
   InputStreamResource	默认返回 true，但实际流可能已关闭或无效
   总结

   ByteArrayResource 的 exists() 永远有效，返回 true。

   它仅表示资源已被成功封装到内存中，不表示数据内容是否有效或非空。

   若需要校验数据有效性，应额外检查字节数组的长度或内容。