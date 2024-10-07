(ns link.views)

(defn main-panel []
  [:div.d-flex.justify-content-center.align-items-center.vh-100
   [:div.d-flex.flex-column.gap-3
    [:h1 "Bruno do Nascimento Maciel"]
    [:h4 "Software Engineer"]
    [:a.btn.btn-secondary.btn-lg {:href   "https://www.linkedin.com/in/bruno-do-nascimento-maciel-7b7a28a9/"
                                  :target "_blank"} "LinkedIn"]
    [:a.btn.btn-secondary.btn-lg {:href   "https://github.com/macielti"
                                  :target "_blank"} "GitHub"]
    [:a.btn.btn-secondary.btn-lg {:href   "https://brunolab.dev.br"
                                  :target "_blank"} "brunolab.dev.br (blog)"]]])
