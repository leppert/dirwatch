;; Copyright © 2013, JUXT. All Rights Reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound by the
;; terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(defproject juxt/dirwatch "0.2.4-SNAPSHOT"
  :description "A directory watcher, wrapping the JDK 7 java.nio.file.WatchService."
  :url "https://juxt.pro/repos/dirwatch"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[com.github.leppert/BarbaryWatchService "8a52255da0"]])
