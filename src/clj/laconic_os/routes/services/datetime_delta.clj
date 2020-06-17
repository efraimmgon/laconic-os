(ns laconic-os.routes.services.datetime-delta
  (:require
    [java-time :as jt]))

(defn find-date
  [date & days]
  (jt/plus
    date
    (jt/days
      (reduce + days))))
#_(find-date (jt/local-date) 30 30)

; "2020-05-22"
#_(find-date 
    (jt/local-date 2020 1 20)
    ;; initial
    40
    ;; 1st (9 days)
    (jt/time-between
      (jt/local-date 2020 2 21)
      (jt/local-date 2020 3 1)
      :days)
    ;; 2nd (30 days)
    (jt/time-between
      (jt/local-date 2020 3 16)
      (jt/local-date 2020 4 15)
      :days)
    ;; 3rd (29 days)
    (jt/time-between
      (jt/local-date 2020 4 16)
      (jt/local-date 2020 5 15)
      :days)
    ;; 4th (15 days)
    (jt/time-between
      (jt/local-date 2020 5 16)
      (jt/local-date 2020 5 31)
      :days))