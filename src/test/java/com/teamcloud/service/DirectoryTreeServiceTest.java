package com.teamcloud.service;

import com.cloud.model.vo.FolderTreeVO;
import com.cloud.service.DirectoryTreeService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Seryang on 2016. 2. 10..
 */
public class DirectoryTreeServiceTest {
    private DirectoryTreeService directoryTreeService = new DirectoryTreeService();
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testGetDirectoryTree() throws Exception {
        FolderTreeVO resultTreeNodes = directoryTreeService.getDirectoryTree(new FolderTreeVO("DataStore", "DataStore"));
        logger.debug("Result Folder Tree : {}", resultTreeNodes);
    }
}