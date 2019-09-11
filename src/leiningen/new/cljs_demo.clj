(ns leiningen.new.cljs-demo
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-demo"))

(defn cljs-demo
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cljs-demo project.")
    (->files data
             ;; Project definitions and readme
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]

             ;; CLJ source
             ["src/clj/handler.clj" (render "src/clj/handler.clj" data)]
             ["src/clj/env.clj" (render "src/clj/env.clj" data)]

             ;; HTML resources
             ["resources/public/index.html" (render "resources/public/index.html" data)]
             ["resources/public/example.html" (render "resources/public/example.html" data)]
             ["resources/public/reframe.html" (render "resources/public/reframe.html" data)]
             ;; CSS resources
             ["resources/public/css/todos.css" (render "resources/public/css/todos.css" data)]

             ;; CLJS resources, example without reframe
             ["src/cljs/example.cljs" (render "src/cljs/example.cljs" data)]

             ;; CLJS resources, reframe
             ["src/cljs_reframe/core.cljs" (render "src/cljs_reframe/core.cljs" data)]
             ["src/cljs_reframe/db.cljs" (render "src/cljs_reframe/db.cljs" data)]
             ["src/cljs_reframe/events.cljs" (render "src/cljs_reframe/events.cljs" data)]
             ["src/cljs_reframe/subs.cljs" (render "src/cljs_reframe/subs.cljs" data)]
             ["src/cljs_reframe/views.cljs" (render "src/cljs_reframe/views.cljs" data)])))
