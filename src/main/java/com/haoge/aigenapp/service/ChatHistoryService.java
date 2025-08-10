package com.haoge.aigenapp.service;

import com.haoge.aigenapp.model.dto.chathistory.ChatHistoryQueryRequest;
import com.haoge.aigenapp.model.entity.User;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.haoge.aigenapp.model.entity.ChatHistory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;

import java.time.LocalDateTime;

/**
 * 对话历史 服务层。
 *
 * @author haoge
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 新增对话历史
     *
     * @param appId       the app id
     * @param message     the message
     * @param messageType the message type
     * @param userId      the user id
     * @return the boolean
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 根据应用id删除对话历史
     *
     * @param appId the app id
     * @return the boolean
     */
    boolean deleteByAppId(Long appId);

    /**
     * 分页查询APP对话记录
     *
     * @param appId          the app id
     * @param pageSize       the page size
     * @param lastCreateTime the last create time
     * @param loginUser      the login user
     * @return the page
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 获取查询包装类
     *
     * @param chatHistoryQueryRequest the chat history query request
     * @return the query wrapper
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    /**
     * 从数据库加载对话历史到记忆存储中
     *
     * @param appId      the app id
     * @param chatMemory the chat memory
     * @param maxCount   the max count
     * @return the int
     */
    int loadChatHistoryToMemory(Long appId, MessageWindowChatMemory chatMemory, int maxCount);
}
