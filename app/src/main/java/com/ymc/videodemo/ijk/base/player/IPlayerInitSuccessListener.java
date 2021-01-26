package com.ymc.videodemo.ijk.base.player;


import com.ymc.videodemo.ijk.base.model.GSYModel;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 播放器初始化成果回调
 */
public interface IPlayerInitSuccessListener {
    void onPlayerInitSuccess(IMediaPlayer player, GSYModel model);
}
