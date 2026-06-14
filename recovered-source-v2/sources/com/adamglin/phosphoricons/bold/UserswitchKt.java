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

/* compiled from: Userswitch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSwitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUserSwitch", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSwitch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserswitchKt {
    private static ImageVector _userSwitch;

    public static final ImageVector getUserSwitch(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _userSwitch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserSwitch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.0f, 174.26f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 196.24f, 177.0f);
        pathBuilder.quadToRelative(-1.47f, 2.06f, -3.05f, 4.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -30.0f, -28.37f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -70.28f, 0.08f);
        pathBuilder.arcToRelative(76.8f, 76.8f, 0.0f, false, false, -30.06f, 28.25f);
        pathBuilder.arcToRelative(83.62f, 83.62f, 0.0f, false, true, -18.3f, -43.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.0f, -17.88f);
        pathBuilder.lineToRelative(-20.0f, -20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-20.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.83f, 17.1f);
        pathBuilder.arcToRelative(107.88f, 107.88f, 0.0f, false, false, 37.72f, 73.61f);
        pathBuilder.arcToRelative(12.33f, 12.33f, 0.0f, false, false, 1.88f, 1.57f);
        pathBuilder.arcToRelative(107.82f, 107.82f, 0.0f, false, false, 136.47f, -0.26f);
        pathBuilder.arcToRelative(13.09f, 13.09f, 0.0f, false, false, 1.28f, -1.06f);
        pathBuilder.arcToRelative(107.66f, 107.66f, 0.0f, false, false, 18.0f, -19.46f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 213.0f, 174.26f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 96.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(83.52f, 83.52f, 0.0f, false, true, -46.94f, -14.37f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 93.88f, 0.0f);
        pathBuilder.arcTo(84.07f, 84.07f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.49f, 136.49f);
        pathBuilder.lineTo(232.49f, 156.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-20.0f, -20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.0f, -17.88f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 59.74f, 79.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 40.26f, 65.0f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, true, 195.4f, 54.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.83f, 17.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSwitch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
