name: Assign difficulty label

on:
  issues:
    types: [opened, edited]

jobs:
  label_difficulty:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - name: Check difficulty
        uses: actions/github-script@v6
        with:
          script: |
            const difficulties = ["Easy","Medium","Hard"];
            for (const d of difficulties) {
              if (issue.body.includes(`- [ ] ${d}`)) {
                await github.issues.addLabels({
                  owner: context.repo.owner,
                  repo: context.repo.repo,
                  issue_number: context.issue.number,
                  labels: [`difficulty: ${d}`]
                });
                break;
              }
            }
