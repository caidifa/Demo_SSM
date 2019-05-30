/*
Navicat SQL Server Data Transfer

Source Server         : local SQLServer
Source Server Version : 120000
Source Host           : 127.0.0.1:1433
Source Database       : Demo_SSM
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 120000
File Encoding         : 65001

Date: 2019-05-30 16:39:57
*/


-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE [dbo].[user_info]
GO
CREATE TABLE [dbo].[user_info] (
[userId] int NOT NULL ,
[userName] varchar(50) NOT NULL 
)


GO

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO [dbo].[user_info] ([userId], [userName]) VALUES (N'1', N'Jack')
GO
GO
INSERT INTO [dbo].[user_info] ([userId], [userName]) VALUES (N'2', N'Mary')
GO
GO
INSERT INTO [dbo].[user_info] ([userId], [userName]) VALUES (N'3', N'Tom')
GO
GO

-- ----------------------------
-- Indexes structure for table user_info
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table user_info
-- ----------------------------
ALTER TABLE [dbo].[user_info] ADD PRIMARY KEY ([userId])
GO
