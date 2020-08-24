# file-copy-from-resouces-dir
- Spring Boot で resources 配下にあるファイルをコピーするデモをまとめたファイル

## 方法
ClassLoader.getSystemResource と commons-io の FileUtils.copyURLToFile を使う

```java
URL srcUrl = ClassLoader.getSystemResource("{resoucesから見たファイルのパス}");
FileUtils.copyURLToFile(srcUrl, new File("{filePath}"));
```

## 必要なライブラリ
build.gradle の dependencies に下記の行を追加する

```
compile group: 'commons-io', name: 'commons-io', version: '2.6'
```