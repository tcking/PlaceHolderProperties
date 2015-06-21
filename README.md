# PlaceHolderProperties
extend from Properties and support placeHolder,for example,the properties file like:
app_home=/giraffe

cache_dir=${app_home}/cache

image_cache=${cache_dir}/imageCache

log_file=${app_home}/app.log


```

properties.getProperty("image_cache"); // /griaffe/cache/imageCache;

```
