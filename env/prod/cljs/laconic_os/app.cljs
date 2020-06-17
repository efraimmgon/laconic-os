(ns laconic-os.app
  (:require [laconic-os.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
