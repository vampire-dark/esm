package net.evil.esm.serivce.impl;

import net.evil.esm.domain.Video;
import net.evil.esm.serivce.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 视频服务层接口实现类
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public List<Video> videoList() {
        return null;
    }
}
