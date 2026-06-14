package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Testtube.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TestTube", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTestTube", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_testTube", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TesttubeKt {
    private static ImageVector _testTube;

    public static final ImageVector getTestTube(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _testTube;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TestTube", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.49f, 83.51f);
        pathBuilder.lineToRelative(-60.0f, -60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(34.28f, 152.75f);
        pathBuilder.arcToRelative(48.77f, 48.77f, 0.0f, false, false, 69.0f, 69.0f);
        pathBuilder.lineTo(214.48f, 110.49f);
        pathBuilder.lineToRelative(21.31f, -7.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, -19.87f);
        pathBuilder.close();
        pathBuilder.moveTo(86.28f, 204.75f);
        pathBuilder.arcToRelative(24.77f, 24.77f, 0.0f, false, true, -35.0f, -35.0f);
        pathBuilder.lineToRelative(28.13f, -28.13f);
        pathBuilder.curveToRelative(7.73f, -2.41f, 19.58f, -3.0f, 35.06f, 5.0f);
        pathBuilder.arcToRelative(83.94f, 83.94f, 0.0f, false, false, 21.95f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.2f, 88.62f);
        pathBuilder.arcToRelative(12.15f, 12.15f, 0.0f, false, false, -4.69f, 2.89f);
        pathBuilder.lineToRelative(-38.89f, 38.9f);
        pathBuilder.curveToRelative(-7.73f, 2.41f, -19.58f, 3.0f, -35.06f, -5.0f);
        pathBuilder.arcToRelative(83.94f, 83.94f, 0.0f, false, false, -21.94f, -8.0f);
        pathBuilder.lineTo(172.0f, 49.0f);
        pathBuilder.lineToRelative(37.79f, 37.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _testTube = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
