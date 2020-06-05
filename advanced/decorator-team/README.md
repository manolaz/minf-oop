# Decorator Pattern Exercise
tags: OOP-TD IEI
Xét một hệ thống quản lý dự án, nơi nhân viên đang làm việc với các vai trò khác nhau, chẳng hạn như thành viên nhóm (team member), trưởng nhóm (team lead) và người quản lý (manager). Một thành viên trong nhóm chịu trách nhiệm thực hiện các nhiệm vụ được giao và phối hợp với các thành viên khác để hoàn thành nhiệm vụ nhóm. Mặt khác, một trưởng nhóm phải quản lý và cộng tác với các thành viên trong nhóm của mình và lập kế hoạch nhiệm vụ của họ. Tương tự như vậy, một người quản lý có thêm một số trách nhiệm đối với một trưởng nhóm như quản lý yêu cầu dự án, tiến độ, phân công công việc.

Sau đây là các thành phần tham gia vào hệ thống và hành vi của chúng:

Employee: thực hiện công việc doTask, tham gia vào dự án join, rời khỏi dự án terminate.
Team member: báo cáo task được giao reportTask, cộng tác với các thành viên khác (coordinate with others).
Team lead: lên kế hoạch planning, hỗ trợ các thành viên phát triển motivate, theo dõi chất lượng công việc và thời gian monitor.
Manager: tạo các yêu cầu dự án createRequirement, giao nhiệm vụ cho thành viên assignTask, quản lý tiến độ dự án manageProgress.
