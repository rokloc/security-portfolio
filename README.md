# Security Portfolio

本リポジトリは、自作Webアプリを用いたOWASP Top 10脆弱性の理解・診断・考察を目的とした学習プロジェクトです。  
Spring Boot, Spring Security, MySQL, Burp Suite, ZAPなどのツールを活用しています。










vulnerability-assessment-portfolio/
├── README.md                     # プロジェクト概要、学習目的、使用技術、リンクなど
├── webapp-secure/               # OWASP TOP10対策済みの安全なWebアプリ
│   ├── src/                     # Spring Boot + MySQL のアプリケーションコード
│   ├── pom.xml                  # Maven設定
│   └── application.yml          # DB・Security設定
├── webapp-vulnerable/           # 脆弱性付きバージョン（診断対象）
│   ├── src/                     # 上記安全版をベースにOWASP TOP10を故意に追加
│   └── vulnerabilities.md       # どの脆弱性をどこに追加したかの解説
├── tools-config/                # Burp Suite, OWASP ZAPなどの設定ファイル、スクリーンショット
├── reports/                     # 診断レポートや考察（PDF or Markdown形式）
│   ├── report_01_injection.md
│   ├── report_02_xss.md
│   └── summary.md               # OWASP TOP10全体のまとめ
├── docs/                        # 徳丸本まとめ、補足学習資料
│   └── tokumaru_notes.md
└── roadmap.md                   # 学習＆開発スケジュール、達成トラッカー
