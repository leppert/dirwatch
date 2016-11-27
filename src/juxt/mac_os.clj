(ns juxt.mac-os
  (:import (java.io File)
           (com.barbarysoftware.watchservice WatchServiceFactory WatchableFile)))

(defn new-watch-service
  []
  (WatchServiceFactory/newWatchService))

(defn prep-file
  [file]
  (new WatchableFile file))

(defn list-files
  [file]
  (-> file .getFile .listFiles))

(defn watchkey->file
  [watchkey ev]
  (-> watchkey
      .watchable
      .getFile))
