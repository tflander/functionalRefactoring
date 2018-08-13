package strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static strategy.Asset.AssetType.*;

public class AssetUtilTest {

    final List<Asset> assets = Arrays.asList(
            new Asset(BOND, 1000),
            new Asset(BOND, 2000),
            new Asset(STOCK, 3000),
            new Asset(STOCK, 4000)
    );

    @Test
    public void totalAssetValues() {
        assertThat(AssetUtil.totalAssetValues(assets)).isEqualTo(10000);
    }
}
