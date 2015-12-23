(defn solution-29
  ;; Write a funtion that takes a string and returns a string containing only
  ;; capital letters
  [sentence]
  (reduce str (re-seq #"[A-Z]" sentence)))
