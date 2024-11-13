/*
 Navicat Premium Dump SQL

 Source Server         : admin
 Source Server Type    : MySQL
 Source Server Version : 80040 (8.0.40)
 Source Host           : localhost:3306
 Source Schema         : lgsx

 Target Server Type    : MySQL
 Target Server Version : 80040 (8.0.40)
 File Encoding         : 65001

 Date: 10/11/2024 11:39:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lg_commodity
-- ----------------------------
DROP TABLE IF EXISTS `lg_commodity`;
CREATE TABLE `lg_commodity`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '编码',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '名称',
  `price` bigint NULL DEFAULT NULL COMMENT '价格',
  `quantity` int NULL DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 135 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of lg_commodity
-- ----------------------------
INSERT INTO `lg_commodity` VALUES (1, '001', '华为荣耀手机', 100000, 0);
INSERT INTO `lg_commodity` VALUES (2, '002', '华为畅享手机', 100000, 0);
INSERT INTO `lg_commodity` VALUES (3, '003', '华为mate手机', 500000, 8);
INSERT INTO `lg_commodity` VALUES (4, '004', '小米3手机', 200000, 8);
INSERT INTO `lg_commodity` VALUES (5, '005', '小米5手机', 400000, 10);
INSERT INTO `lg_commodity` VALUES (6, '006', '红米pro手机', 500000, 1);
INSERT INTO `lg_commodity` VALUES (7, '007', 'iPhone16手机', 600000, 9);
INSERT INTO `lg_commodity` VALUES (9, '009', '星际旅行枕', 29900, 7);
INSERT INTO `lg_commodity` VALUES (10, '010', '魔法森林香薰', 8900, 0);
INSERT INTO `lg_commodity` VALUES (11, '011', '云端漫步拖鞋', 6900, 10);
INSERT INTO `lg_commodity` VALUES (12, '012', '月光宝盒首饰盒', 19900, 3);
INSERT INTO `lg_commodity` VALUES (13, '013', '量子波动饮料', 3900, 8);
INSERT INTO `lg_commodity` VALUES (14, '014', '银河系巧克力', 5900, 1);
INSERT INTO `lg_commodity` VALUES (15, '015', '梦境捕手日记本', 4900, 6);
INSERT INTO `lg_commodity` VALUES (16, '016', '时光隧道书签', 1900, 5);
INSERT INTO `lg_commodity` VALUES (17, '017', '星际迷航咖啡杯', 4900, 9);
INSERT INTO `lg_commodity` VALUES (18, '018', '魔法师的帽子茶壶', 15900, 2);
INSERT INTO `lg_commodity` VALUES (19, '019', '云端存储U盘', 6900, 10);
INSERT INTO `lg_commodity` VALUES (20, '020', '彩虹制造机 ', 29900, 4);
INSERT INTO `lg_commodity` VALUES (21, '021', '神秘海域香水', 19900, 7);
INSERT INTO `lg_commodity` VALUES (22, '022', '未来战士健身器材', 79900, 0);
INSERT INTO `lg_commodity` VALUES (23, '023', '梦幻花园盆栽', 4900, 3);
INSERT INTO `lg_commodity` VALUES (24, '024', '时空穿梭者手表', 29900, 8);
INSERT INTO `lg_commodity` VALUES (25, '025', '银河探险家望远镜', 49900, 1);
INSERT INTO `lg_commodity` VALUES (26, '026', '魔法书立', 3900, 6);
INSERT INTO `lg_commodity` VALUES (27, '027', '大香蕉', 2200, 5);
INSERT INTO `lg_commodity` VALUES (28, '028', '金坷垃', 12000, 7);
INSERT INTO `lg_commodity` VALUES (29, '029', '发硬的袜子', 3800, 5);
INSERT INTO `lg_commodity` VALUES (30, '030', '期末考试答案', 99900, 7);
INSERT INTO `lg_commodity` VALUES (32, '032', '星际旅行杯', 4500, 7);
INSERT INTO `lg_commodity` VALUES (33, '033', '云端梦境枕', 6700, 15);
INSERT INTO `lg_commodity` VALUES (34, '034', '量子波动饮料', 8100, 1);
INSERT INTO `lg_commodity` VALUES (35, '035', '银河系巧克力', 9200, 19);
INSERT INTO `lg_commodity` VALUES (36, '036', '时光隧道书签', 3400, 4);
INSERT INTO `lg_commodity` VALUES (37, '037', '梦境捕手日记本', 5600, 11);
INSERT INTO `lg_commodity` VALUES (38, '038', '时空穿梭者手表', 7800, 3);
INSERT INTO `lg_commodity` VALUES (39, '039', '魔法森林香薰', 9000, 16);
INSERT INTO `lg_commodity` VALUES (40, '040', '月光宝盒首饰盒', 1200, 9);
INSERT INTO `lg_commodity` VALUES (41, '041', '云端漫步拖鞋', 3500, 6);
INSERT INTO `lg_commodity` VALUES (42, '042', '星际通讯耳机', 5700, 13);
INSERT INTO `lg_commodity` VALUES (43, '043', '未来战士健身器材', 8900, 8);
INSERT INTO `lg_commodity` VALUES (44, '044', '梦幻花园盆栽', 4100, 17);
INSERT INTO `lg_commodity` VALUES (45, '045', '彩虹制造机', 6200, 20);
INSERT INTO `lg_commodity` VALUES (46, '046', '神秘海域香水', 3400, 2);
INSERT INTO `lg_commodity` VALUES (47, '047', '魔法师的帽子茶壶', 5600, 10);
INSERT INTO `lg_commodity` VALUES (48, '048', '星际迷航咖啡杯', 7800, 5);
INSERT INTO `lg_commodity` VALUES (49, '049', '量子波动饮料', 9200, 14);
INSERT INTO `lg_commodity` VALUES (50, '050', '银河探险家望远镜', 2300, 18);
INSERT INTO `lg_commodity` VALUES (51, '051', '魔法书立', 4500, 1);
INSERT INTO `lg_commodity` VALUES (52, '052', '星际旅行者背包', 6700, 6);
INSERT INTO `lg_commodity` VALUES (53, '053', '云端存储U盘', 8100, 11);
INSERT INTO `lg_commodity` VALUES (54, '054', '彩虹雨伞', 9200, 15);
INSERT INTO `lg_commodity` VALUES (55, '055', '神秘海域潜水镜', 3400, 19);
INSERT INTO `lg_commodity` VALUES (56, '056', '未来战士运动鞋', 5600, 7);
INSERT INTO `lg_commodity` VALUES (57, '057', '梦幻花园浇水器', 7800, 12);
INSERT INTO `lg_commodity` VALUES (58, '058', '时空穿梭者指南针', 9000, 4);
INSERT INTO `lg_commodity` VALUES (59, '059', '魔法森林探险帽', 1200, 3);
INSERT INTO `lg_commodity` VALUES (60, '060', '月光宝盒手链', 3500, 13);
INSERT INTO `lg_commodity` VALUES (61, '061', '云端漫步鞋', 5700, 10);
INSERT INTO `lg_commodity` VALUES (62, '062', '星际通讯手机壳', 8900, 16);
INSERT INTO `lg_commodity` VALUES (63, '063', '未来战士运动服', 4100, 8);
INSERT INTO `lg_commodity` VALUES (64, '064', '梦幻花园种子包', 6200, 2);
INSERT INTO `lg_commodity` VALUES (65, '065', '彩虹风筝', 3400, 5);
INSERT INTO `lg_commodity` VALUES (66, '066', '神秘海域防晒霜', 5600, 14);
INSERT INTO `lg_commodity` VALUES (67, '067', '魔法师的披风', 7800, 18);
INSERT INTO `lg_commodity` VALUES (68, '068', '星际迷航帽子', 9200, 9);
INSERT INTO `lg_commodity` VALUES (69, '069', '量子波动护腕', 2300, 20);
INSERT INTO `lg_commodity` VALUES (70, '070', '银河系运动鞋', 4500, 1);
INSERT INTO `lg_commodity` VALUES (71, '071', '时光隧道手链', 6700, 17);
INSERT INTO `lg_commodity` VALUES (72, '072', '梦境捕手眼罩', 8100, 11);
INSERT INTO `lg_commodity` VALUES (73, '073', '时空穿梭者地图', 9200, 4);
INSERT INTO `lg_commodity` VALUES (74, '074', '魔法森林指南针', 3400, 11);
INSERT INTO `lg_commodity` VALUES (75, '075', '月光宝盒戒指', 5600, 6);
INSERT INTO `lg_commodity` VALUES (76, '076', '云端漫步裤', 7800, 15);
INSERT INTO `lg_commodity` VALUES (77, '077', '星际通讯手表', 9000, 2);
INSERT INTO `lg_commodity` VALUES (78, '078', '未来战士头盔', 1200, 10);
INSERT INTO `lg_commodity` VALUES (79, '079', '梦幻花园肥料', 3500, 19);
INSERT INTO `lg_commodity` VALUES (80, '080', '彩虹跳绳', 5700, 7);
INSERT INTO `lg_commodity` VALUES (81, '081', '神秘海域泳衣', 8900, 3);
INSERT INTO `lg_commodity` VALUES (82, '082', '魔法师的魔杖', 4100, 13);
INSERT INTO `lg_commodity` VALUES (83, '083', '星际迷航手套', 6200, 16);
INSERT INTO `lg_commodity` VALUES (84, '084', '量子波动眼镜', 3400, 8);
INSERT INTO `lg_commodity` VALUES (85, '085', '银河系围巾', 5600, 9);
INSERT INTO `lg_commodity` VALUES (86, '086', '时光隧道耳环', 7800, 18);
INSERT INTO `lg_commodity` VALUES (87, '087', '梦境捕手笔', 9200, 5);
INSERT INTO `lg_commodity` VALUES (88, '088', '时空穿梭者背包', 2300, 14);
INSERT INTO `lg_commodity` VALUES (89, '089', '魔法森林帐篷', 4500, 0);
INSERT INTO `lg_commodity` VALUES (90, '090', '月光宝盒项链', 6700, 20);
INSERT INTO `lg_commodity` VALUES (91, '091', '云端漫步夹克', 8100, 11);
INSERT INTO `lg_commodity` VALUES (92, '092', '星际通讯手环', 9200, 17);
INSERT INTO `lg_commodity` VALUES (93, '093', '未来战士护腕', 3400, 4);
INSERT INTO `lg_commodity` VALUES (94, '094', '梦幻花园花盆', 5600, 6);
INSERT INTO `lg_commodity` VALUES (95, '095', '彩虹瑜伽垫', 7800, 2);
INSERT INTO `lg_commodity` VALUES (96, '096', '神秘海域沙滩巾', 9000, 10);
INSERT INTO `lg_commodity` VALUES (97, '097', '魔法师的帽子', 1200, 15);
INSERT INTO `lg_commodity` VALUES (98, '098', '星际迷航T恤', 3500, 19);
INSERT INTO `lg_commodity` VALUES (99, '099', '量子波动袜子', 5700, 7);
INSERT INTO `lg_commodity` VALUES (100, '100', '银河系帽子', 8900, 12);
INSERT INTO `lg_commodity` VALUES (101, '101', '时光隧道手表', 4100, 3);
INSERT INTO `lg_commodity` VALUES (102, '102', '梦境捕手笔记本', 6200, 12);
INSERT INTO `lg_commodity` VALUES (103, '103', '时空穿梭者水壶', 3400, 16);
INSERT INTO `lg_commodity` VALUES (104, '104', '魔法森林手帕', 5600, 8);
INSERT INTO `lg_commodity` VALUES (105, '105', '月光宝盒耳环', 7800, 11);
INSERT INTO `lg_commodity` VALUES (106, '106', '云端漫步鞋垫', 9200, 5);
INSERT INTO `lg_commodity` VALUES (107, '107', '星际通讯充电器', 2300, 14);
INSERT INTO `lg_commodity` VALUES (108, '108', '未来战士跑鞋', 4500, 18);
INSERT INTO `lg_commodity` VALUES (109, '109', '梦幻花园肥料', 6700, 9);
INSERT INTO `lg_commodity` VALUES (110, '110', '彩虹发带', 8100, 20);
INSERT INTO `lg_commodity` VALUES (111, '111', '神秘海域拖鞋', 9200, 1);
INSERT INTO `lg_commodity` VALUES (112, '112', '魔法师的斗篷', 3400, 17);
INSERT INTO `lg_commodity` VALUES (113, '113', '星际迷航短裤', 5600, 4);
INSERT INTO `lg_commodity` VALUES (114, '114', '量子波动手环', 7800, 6);
INSERT INTO `lg_commodity` VALUES (115, '115', '银河系运动鞋', 9000, 2);
INSERT INTO `lg_commodity` VALUES (116, '116', '时光隧道腰带', 1200, 10);
INSERT INTO `lg_commodity` VALUES (117, '117', '梦境捕手睡衣', 3500, 15);
INSERT INTO `lg_commodity` VALUES (118, '118', '时空穿梭者帽子', 5700, 19);
INSERT INTO `lg_commodity` VALUES (119, '119', '魔法森林背包', 8900, 7);
INSERT INTO `lg_commodity` VALUES (120, '120', '月光宝盒手表', 4100, 12);
INSERT INTO `lg_commodity` VALUES (121, '121', '云端漫步袜子', 6200, 3);
INSERT INTO `lg_commodity` VALUES (122, '122', '星际通讯耳机', 3400, 13);
INSERT INTO `lg_commodity` VALUES (123, '123', '未来战士手套', 5600, 16);
INSERT INTO `lg_commodity` VALUES (124, '124', '梦幻花园剪枝器', 7800, 8);
INSERT INTO `lg_commodity` VALUES (125, '125', '彩虹太阳镜', 9200, 12);
INSERT INTO `lg_commodity` VALUES (126, '126', '爱因斯坦的智慧+1', 2300, 7);
INSERT INTO `lg_commodity` VALUES (127, '127', '抽象的思维', 4500, 15);
INSERT INTO `lg_commodity` VALUES (128, '128', '光头强的头发', 6700, 1);
INSERT INTO `lg_commodity` VALUES (129, '129', '大香蕉', 8100, 19);
INSERT INTO `lg_commodity` VALUES (130, '130', '发硬袜子', 9200, 4);
INSERT INTO `lg_commodity` VALUES (131, '131', '勾兑豆浆', 1000, 23);
INSERT INTO `lg_commodity` VALUES (132, '132', '姜尸肉包', 300, 7);
INSERT INTO `lg_commodity` VALUES (133, '133', '清朝老鸡', 3000, 6);
INSERT INTO `lg_commodity` VALUES (134, '155', '牛魔', 5600, 2);

-- ----------------------------
-- Table structure for lg_order
-- ----------------------------
DROP TABLE IF EXISTS `lg_order`;
CREATE TABLE `lg_order`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `user_id` int NULL DEFAULT NULL COMMENT '用户id',
  `user_nick_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `commodity_code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编码',
  `commodity_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `purchase_price` bigint NULL DEFAULT NULL COMMENT '购买价格',
  `consume_integral` bigint NULL DEFAULT NULL COMMENT '消耗积分',
  `address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货地址',
  `consignee` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货人',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of lg_order
-- ----------------------------
INSERT INTO `lg_order` VALUES (22, 'DW0642', 2, '小新', '004', '小米3手机', 200000, 0, 'z', 'z', 'z');
INSERT INTO `lg_order` VALUES (23, 'DW6015', 1, '小川', '001', '华为荣耀手机', 200020, 0, 'z', 'z', 'z');
INSERT INTO `lg_order` VALUES (24, 'DW7115', 2, '小新', '102', '梦境捕手笔记本', 6200, 0, 'cdut', 'ws', '182');
INSERT INTO `lg_order` VALUES (25, 'DW3832', 1, '小川', '002', '华为畅享手机', 100000, 0, 'cdut', 'ws', '182');
INSERT INTO `lg_order` VALUES (26, 'DW5020', 1, '小川', '002', '华为畅享手机', 100000, 0, 'cdut', 'ws', '182');
INSERT INTO `lg_order` VALUES (27, 'DW4174', 1, '小川', '002', '华为畅享手机', 100000, 0, 'cdut', 'ws', '182');
INSERT INTO `lg_order` VALUES (28, 'DW2418', 1, '小川', '003', '华为mate手机', 500000, 0, 'cdut', 'ws', '182');

-- ----------------------------
-- Table structure for lg_user
-- ----------------------------
DROP TABLE IF EXISTS `lg_user`;
CREATE TABLE `lg_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `nick_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `amount_of_money` bigint NULL DEFAULT NULL COMMENT '金额(余额)',
  `integral` bigint NULL DEFAULT NULL COMMENT '积分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of lg_user
-- ----------------------------
INSERT INTO `lg_user` VALUES (1, 'xiaochuan', '123456', '小川', 3199960, 0);
INSERT INTO `lg_user` VALUES (2, 'xiaoxin', '123', '小新', 100793800, 0);
INSERT INTO `lg_user` VALUES (3, 'xiaochuan', '123', '123', 0, 0);
INSERT INTO `lg_user` VALUES (4, 'xiaochuan', '123', '123', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
