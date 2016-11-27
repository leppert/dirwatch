(ns juxt.default-os
  (:import (java.io File)
           (java.nio.file)
           (java.nio.file FileSystems)))

(defn new-watch-service
  []
  (.newWatchService (FileSystems/getDefault)))

(defn prep-file
  [file]
  (.toPath file))

(defn list-files
  [path]
  (-> path .toAbsolutePath .toFile .listFiles))

(defn watchkey->file
  [watchkey ev]
  (.toFile (.resolve (.watchable watchkey) (.context ev))))
