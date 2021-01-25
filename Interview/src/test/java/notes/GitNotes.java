package notes;

public class GitNotes {

	public static void main(String[] args) {
/*	    How to use Git hub : https://guides.github.com/activities/hello-world/	
 *      Login to Github and create a repository
		If repository already exists, import or clone to your eclipse
		Download git from https://git-scm.com/download/
		Install in C:\Program Files\Git
		If project already exists in eclipse do Team>>Share Project and create a git local repository in same drive as eclipse workspace
		Open command prompt(Or git-bash.exe) go to local repository
		C:\>D:
		D:\>cd Git
		D:\>cd git branch - This is very important as we need to confirm the branch before committing code.
		D:\Git>git status
		D:\Git>git pull - This is required if we want to get the code updates/commits of other team members. OR
		D:\Git>git pull origin master - This also serves the same purpose
		Type 
		D:\Git>git add filename
		OR
		D:\Git>git add .
		D:\Git>git stash - Temporarily saves only modified files and will not be listed for commit. (First we need to index the file)
		D:\Git>git stash -u - Temporarily saves both modified files and new files and will not be listed for commit.
		D:\Git>git commit -m "comments"
		D:\Git>git push
		After above commands are executed, code will be committed to remote repository-branch
		git status - Shows the working tree status
		git add - Add file contents to index.
		git *java - It will add all the java files.
		git commit - Record changes to the repository.
		git push - Update remote refs along with associated objects.
		git diff filename - lists the difference between what was present and what was added to a specified file.
		
		Once commit is done go to Git web site and create a PR or pull request. Enter proper comments and select a reviewer (Send the PR URL to them). 
		Click create pull request.
		After review is done by the reviewer, click on Merge pull request and then confirm merge. Now you should see that the branch code is merged with
		master code.
		
		How to get latest code from master branch (Committed by other team members):
		git checkout master
		git branch - Just to ensure we are in master branch.
		git pull origin master
		Now we have latest code in master branch.
		Switch to local branch now.
		git checkout practice-java
		git pull origin master
		Now we have the latest code copied from master to local branch.
		Need to revisit below section. Did not fully understand.
		Sometimes when we have local changes and we try to get latest code in master, local changes might give some error
		Then we have to do git stash to temporarily save local changes.
		Then do git pull origin master in master branch and do git stash apply. All code will be merged and updated.
		
		
Resolving merge conflicts:		
1. Add some code in line N to file X from system 1.
2. Add some code in line N to same file X from system 2.
3. Do git pull origin master from local.
4. You will see a message  - Your local changes to the following files would be overwritten by merge.
5. Do git stash to save your local changes temporarily.
6. Do git status and you will not see your local file
7. Now do git pull origin master from local. Git will do auto merge.
8. Press ESC, then :wq
9. Do git stash apply to apply the temporarily saved local changes in step 5.
10.You can now see conflict.
11.Manually resolve the conflict by keeping the changes we want and deleting that we dont need.
12.git status
13.git add *java
14.git commit -m "Resolved conflicts"
15.git push origin practice-java
16.Now we can create PR and get it reviewed and merged to master.
17.Go to master branch and do git pull origin master to see the latest code in master.
18.Repeat step 17 for local branch
		-----------------------------------------------------------------------------------------------------
		Then create a branch. -b argument should be given only when creating new branch. For existing branch checkout skip -b.
		
		D:\Git>git checkout -b "branch name"
Switched to a new branch 'branch name'
D:\Git>git branch
* branch name
  master
D:\Git>git branch
* bhanu_local
  master
D:\Git>git status
On branch branch name
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
        modified:   src/main/java/com/test/selenium/testbase/B.java
no changes added to commit (use "git add" and/or "git commit -a")
D:\Git>git add .
D:\Git>git commit -m "Modifed some code in class"
[branch name d7a53c6] Modifed some code in class
 1 file changed, 4 insertions(+)
D:\Git>git push
fatal: The current branch bhanu_local has no upstream branch.
To push the current branch and set the remote as upstream, use
    git push --set-upstream origin bhanu_local
D:\Git>git push origin branch name
Counting objects: 10, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (10/10), 751 bytes | 375.00 KiB/s, done.
Total 10 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/LearnByBhanuPratap/seleniumScripts.git
 * [new branch]      bhanu_local -> bhanu_local
 * 
 * Now we have to get the peer review done. Go to Git hub and click on Compare and pull request.
 * Click on create pull request after seeing the comparison.
 * Share the pull request URL for peer review.
 * Once review is done and approved, go to the same URL and click on Merge pull request. This will send code to the master branch.
 *  
 * The below command will give the latest code from master
D:\Git>git pull origin master
From https://github.com/LearnByBhanuPratap/seleniumScripts
 * branch            master     -> FETCH_HEAD
Updating d7a53c6..225a089
Fast-forward
D:\Git>git status
On branch branch name
nothing to commit, working tree clean
D:\Git>git branch
* branch name
  master
  
  Or instead of above code below code will also give the latest code from master
D:\Git>git checkout master
Switched to branch 'master'
Your branch is behind 'origin/master' by 2 commits, and can be fast-forwarded.
  (use "git pull" to update your local branch)
D:\Git>git branch
  branch name
* master
D:\Git>git checkout branch name
Switched to branch 'branch name'
D:\Git>git branch
* branch name
  master
  
  -------------------------------------------------------------------------------------------------
  Recover a deleted local branch:
  AMIT@DESKTOP-D8C95I2 MINGW64 ~/Desktop
$ cd D:

AMIT@DESKTOP-D8C95I2 MINGW64 /d
$ cd D:\Git

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git branch
* Amit-Protractor
  master
  practice-java
  sub-repo

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git fsck --full --no-reflogs --unreachable --lost-found | grep commit | cut -d\  -f3 | xargs -n 1 git log -n 1 --pretty=oneline > .git/lost-found.txt
Checking object directories: 100% (256/256), done.
Checking objects: 100% (7161/7161), done.

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git log -p <commit>
bash: syntax error near unexpected token `newline'

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git reflog show
b6127d6 (HEAD -> Amit-Protractor, origin/Amit-Protractor) HEAD@{0}: commit: Recovering deleted protractor code. Thank god.
daaa40a (origin/practice-java, sub-repo, practice-java) HEAD@{1}: checkout: moving from practice-java to Amit-Protractor
daaa40a (origin/practice-java, sub-repo, practice-java) HEAD@{2}: checkout: moving from Amit-Protractor to practice-java
3cde972 HEAD@{3}: commit: Deleting protractor branch as it should be committed to new repo
6200ef8 HEAD@{4}: commit: Committing Protractor with Javascript upskilling project files dated 17122020
daaa40a (origin/practice-java, sub-repo, practice-java) HEAD@{5}: checkout: moving from practice-java to Amit-Protractor
daaa40a (origin/practice-java, sub-repo, practice-java) HEAD@{6}: commit: Adding postman updated tutorial file - 12082020
46d1ffb HEAD@{7}: commit: Adding further practice files after getting job
5535640 HEAD@{8}: commit: Xpath changes to switching windows script.
b65c58e HEAD@{9}: commit: Deleting screenshots
9accb49 HEAD@{10}: commit: Deleting screenshots

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git branch Amit-Protractor 3cde972
fatal: A branch named 'Amit-Protractor' already exists.

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (Amit-Protractor)
$ git checkout practice-java
Switched to branch 'practice-java'
M       restAPIFramework
Your branch is up to date with 'origin/practice-java'.

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git push origin --delete Amit-Protractor
remote:
remote: GitHub found 3 vulnerabilities on amit-inamdar84/Selenium-Scripts's default branch (2 high, 1 moderate). To find out more, visit:
remote:      https://github.com/amit-inamdar84/Selenium-Scripts/security/dependabot
remote:
To https://github.com/amit-inamdar84/Selenium-Scripts
 - [deleted]         Amit-Protractor

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ ^C

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git branch Amit-Protractor 3cde972
fatal: A branch named 'Amit-Protractor' already exists.

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git branch -d Amit-Protractor
error: The branch 'Amit-Protractor' is not fully merged.
If you are sure you want to delete it, run 'git branch -D Amit-Protractor'.

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git branch -D Amit-Protractor
Deleted branch Amit-Protractor (was b6127d6).

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git branch Amit-Protractor 3cde972

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git branch
  Amit-Protractor
  master
* practice-java
  sub-repo

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git checkout Amit-Protractor
error: The following untracked working tree files would be overwritten by checkout:
        ProtractorPractice/Calculator.js
        ProtractorPractice/Jasmine.txt
        ProtractorPractice/Pending.txt
        ProtractorPractice/TC001.js
        ProtractorPractice/configuration.js
        ProtractorPractice/data.js
        ProtractorPractice/package.json
Please move or remove them before you switch branches.
Aborting

AMIT@DESKTOP-D8C95I2 MINGW64 /d/Git (practice-java)
$ git checkout Amit-Protractor
Updating files: 100% (3472/3472), done.
Switched to branch 'Amit-Protractor'
M       restAPIFramework

  
*/		

	}

}
